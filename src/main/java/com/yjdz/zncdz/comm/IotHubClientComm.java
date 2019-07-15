package com.yjdz.zncdz.comm;

import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.iothub.IotHubClient;
import com.baidubce.services.iothub.model.ListPermissionResponse;
import com.baidubce.services.iothub.model.Operation;
import com.baidubce.services.iothub.model.Permission;
import com.baidubce.services.iothub.model.QueryPermissionResponse;

import java.util.ArrayList;
import java.util.List;

public final class IotHubClientComm {

    private IotHubClientComm() {
    }

    // 初始化相关参数
    private static final String AK = "6070c7254cd84c7f8a6c7bb59912ec04";
    private static final String SK = "6eb6abfd855e43858c7e652f6a524343";
    private static final String ENDPOINT = "iot.gz.baidubce.com";

    //使用物接入相关参数
    private static final String ENDPOINT_NAME = "gfnz1fy";
    private static final String THING_NAME = "gfnz1fy/public";
    private static final String PRINCIPAL_NAME = "public";
    private static final String POLICY_NAME = "public";

    public static IotHubClient getIotHubClient() {
        //创建物接入client
        //创建物接入client
        BceClientConfiguration config = new BceClientConfiguration()
                .withCredentials(new DefaultBceCredentials(AK, SK))
                .withEndpoint(ENDPOINT);
        IotHubClient iotHubClient = new IotHubClient(config);
        return iotHubClient;
    }

    /**
     * 创建Topic
     */
    public static String createTopic(String topicName) {

        //准备operation参数，可以添加"PUBLISH"或"SUBSCRIBE",也可以都加
        List<Operation> operations = new ArrayList<Operation>();
        operations.add(Operation.SUBSCRIBE);
        operations.add(Operation.PUBLISH);
        //创建permission参数包括endpoint、policy、操作类型、topic，response里有permissionUuid
        QueryPermissionResponse response = getIotHubClient().createPermission(ENDPOINT_NAME,
                POLICY_NAME,
                operations,
                topicName);
       return response.getPermissionUuid();
    }

    /**
     * 列出指定policy下所有permission
     */
    public static List<Permission> getPermissionList() {

        ListPermissionResponse responseList = getIotHubClient().listPermission(ENDPOINT_NAME, POLICY_NAME);
        return responseList.getResult();
    }
    /**
     * 根据permissionId获取指定topic
     */
    public static String findPermission(String permissionUuid){
        QueryPermissionResponse response = getIotHubClient().queryPermission(ENDPOINT_NAME,permissionUuid);
        return response.getPermissionUuid();
    }

} 