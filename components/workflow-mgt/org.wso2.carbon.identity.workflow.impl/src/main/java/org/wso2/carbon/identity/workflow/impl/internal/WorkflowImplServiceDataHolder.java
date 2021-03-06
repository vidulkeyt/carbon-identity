/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.workflow.impl.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleContext;
import org.wso2.carbon.base.api.ServerConfigurationService;
import org.wso2.carbon.identity.workflow.impl.WorkflowImplService;
import org.wso2.carbon.identity.workflow.impl.listener.WorkflowImplServiceListener;
import org.wso2.carbon.identity.workflow.mgt.WorkflowManagementService;
import org.wso2.carbon.user.core.service.RealmService;
import org.wso2.carbon.utils.ConfigurationContextService;

import java.util.ArrayList;
import java.util.List;


public class WorkflowImplServiceDataHolder {

    private static WorkflowImplServiceDataHolder instance = new WorkflowImplServiceDataHolder();
    private static Log log = LogFactory.getLog(WorkflowImplServiceDataHolder.class);

    private RealmService realmService;
    private ConfigurationContextService configurationContextService;
    private BundleContext bundleContext;
    private List<WorkflowImplServiceListener> workflowListenerList = new ArrayList<>();

    private ServerConfigurationService serverConfigurationService;

    public ServerConfigurationService getServerConfigurationService() {
        return serverConfigurationService;
    }

    public void setServerConfigurationService(
            ServerConfigurationService serverConfigurationService) {
        this.serverConfigurationService = serverConfigurationService;
    }

    private WorkflowManagementService workflowManagementService;

    public WorkflowManagementService getWorkflowManagementService() {
        return workflowManagementService;
    }

    public void setWorkflowManagementService(
            WorkflowManagementService workflowManagementService) {
        this.workflowManagementService = workflowManagementService;
    }

    private WorkflowImplService workflowImplService = null;

    private WorkflowImplServiceDataHolder() {

    }

    public static WorkflowImplServiceDataHolder getInstance() {

        return instance;
    }

    public ConfigurationContextService getConfigurationContextService() {

        return configurationContextService;
    }

    public void setConfigurationContextService(
            ConfigurationContextService configurationContextService) {

        this.configurationContextService = configurationContextService;
    }

    public BundleContext getBundleContext() {

        return bundleContext;
    }

    public void setBundleContext(BundleContext bundleContext) {

        this.bundleContext = bundleContext;
    }

    public RealmService getRealmService() {

        return realmService;
    }

    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    public WorkflowImplService getWorkflowImplService() {
        return workflowImplService;
    }

    public void setWorkflowImplService(WorkflowImplService workflowImplService) {
        this.workflowImplService = workflowImplService;
    }

    public List<WorkflowImplServiceListener> getWorkflowListenerList() {
        return workflowListenerList;
    }

}

