package org.zstack.network.service.virtualrouter;

import org.zstack.core.GlobalProperty;
import org.zstack.core.GlobalPropertyDefinition;

import java.util.List;

/**
 */
@GlobalPropertyDefinition
public class VirtualRouterGlobalProperty {
    @GlobalProperty(name="VirtualRouter.agentPackageName", defaultValue = "virtualrouter-0.7.tar.gz")
    public static String AGENT_PACKAGE_NAME;
    @GlobalProperty(name="VirtualRouter.agentPort", defaultValue = "7272")
    public static int AGENT_PORT;
    @GlobalProperty(name="VirtualRouter.agentUrlRootPath", defaultValue = "")
    public static String AGENT_URL_ROOT_PATH;
    @GlobalProperty(name="VirtualRouter.agentUrlScheme", defaultValue = "http")
    public static String AGENT_URL_SCHEME;
    @GlobalProperty(name="VirtualRouter.portsOpenOnManagementNic.tcp.")
    public static List<String> TCP_PORTS_ON_MGMT_NIC;
    @GlobalProperty(name="VirtualRouter.portsOpenOnManagementNic.udp.")
    public static List<String> UDP_PORTS_ON_MGMT_NIC;
    @GlobalProperty(name="VirtualRouter.virtualEnvPackage", defaultValue = "virtualrouter-virtualenv.tar.bz")
    public static String VIRTUAL_ENV_PACKAGE;
    @GlobalProperty(name="VirtualRouter.deployPackageOnReconnect", defaultValue = "false")
    public static String DEPLOY_PACKAGE_ON_RECONNECT;
}
