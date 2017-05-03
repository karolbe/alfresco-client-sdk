package org.alfresco.client.services.process.activiti.core.api;

import static org.alfresco.client.services.process.activiti.core.ActivitiConstant.ACTIVITI_SERVICE_PATH;

import org.alfresco.client.services.process.activiti.core.model.representation.ProcessEngineInfoResponse;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by jpascal on 03/05/2017.
 */
public interface ExecutionsAPI
{

    // FIXME type ?
    /**
     * Create variables on an execution
     *
     * @param executionId The id of the execution to create the new variable
     *            for. (required)
     * @return Object
     */
    @POST(ACTIVITI_SERVICE_PATH + "/runtime/executions/{executionId}/variables")
    Call<Object> createExecutionVariable(@Path("executionId") String executionId);

    /**
     * Update variables on an execution
     *
     * @param executionId The id of the execution to the variables for.
     *            (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    @PUT(ACTIVITI_SERVICE_PATH + "/runtime/executions/{executionId}/variables")
    Call<ProcessEngineInfoResponse> getEngineInfoCall();

    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
}