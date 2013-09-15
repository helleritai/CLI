
package com.checkmarx.cxviewer.ws.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CxCLIWebServiceSoap", targetNamespace = "http://Checkmarx.com/v7")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CxCLIWebServiceSoap {


    /**
     * 
     * @param sessionId
     * @param args
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSResponseRunID
     */
    @WebMethod(operationName = "Scan", action = "http://Checkmarx.com/v7/Scan")
    @WebResult(name = "ScanResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "Scan", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.Scan")
    @ResponseWrapper(localName = "ScanResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.ScanResponse")
    public CxWSResponseRunID scan(
        @WebParam(name = "sessionId", targetNamespace = "http://Checkmarx.com/v7")
        String sessionId,
        @WebParam(name = "args", targetNamespace = "http://Checkmarx.com/v7")
        CliScanArgs args);

    /**
     * 
     * @param sessionID
     * @param comment
     * @param scanID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSBasicRepsonse
     */
    @WebMethod(operationName = "UpdateScanComment", action = "http://Checkmarx.com/v7/UpdateScanComment")
    @WebResult(name = "UpdateScanCommentResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "UpdateScanComment", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.UpdateScanComment")
    @ResponseWrapper(localName = "UpdateScanCommentResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.UpdateScanCommentResponse")
    public CxWSBasicRepsonse updateScanComment(
        @WebParam(name = "sessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID,
        @WebParam(name = "ScanID", targetNamespace = "http://Checkmarx.com/v7")
        long scanID,
        @WebParam(name = "Comment", targetNamespace = "http://Checkmarx.com/v7")
        String comment);

    /**
     * 
     * @param sessionID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSResponsePresetList
     */
    @WebMethod(operationName = "GetPresetList", action = "http://Checkmarx.com/v7/GetPresetList")
    @WebResult(name = "GetPresetListResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "GetPresetList", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetPresetList")
    @ResponseWrapper(localName = "GetPresetListResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetPresetListResponse")
    public CxWSResponsePresetList getPresetList(
        @WebParam(name = "SessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSResponseConfigSetList
     */
    @WebMethod(operationName = "GetConfigurationSetList", action = "http://Checkmarx.com/v7/GetConfigurationSetList")
    @WebResult(name = "GetConfigurationSetListResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "GetConfigurationSetList", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetConfigurationSetList")
    @ResponseWrapper(localName = "GetConfigurationSetListResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetConfigurationSetListResponse")
    public CxWSResponseConfigSetList getConfigurationSetList(
        @WebParam(name = "SessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSResponseProjectsDisplayData
     */
    @WebMethod(operationName = "GetProjectsDisplayData", action = "http://Checkmarx.com/v7/GetProjectsDisplayData")
    @WebResult(name = "GetProjectsDisplayDataResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "GetProjectsDisplayData", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetProjectsDisplayData")
    @ResponseWrapper(localName = "GetProjectsDisplayDataResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetProjectsDisplayDataResponse")
    public CxWSResponseProjectsDisplayData getProjectsDisplayData(
        @WebParam(name = "sessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID);

    /**
     * 
     * @param projectID
     * @param sessionID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSResponseProjectConfig
     */
    @WebMethod(operationName = "GetProjectConfiguration", action = "http://Checkmarx.com/v7/GetProjectConfiguration")
    @WebResult(name = "GetProjectConfigurationResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "GetProjectConfiguration", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetProjectConfiguration")
    @ResponseWrapper(localName = "GetProjectConfigurationResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetProjectConfigurationResponse")
    public CxWSResponseProjectConfig getProjectConfiguration(
        @WebParam(name = "sessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID,
        @WebParam(name = "projectID", targetNamespace = "http://Checkmarx.com/v7")
        long projectID);

    /**
     * 
     * @param projectConfiguration
     * @param projectID
     * @param sessionID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSBasicRepsonse
     */
    @WebMethod(operationName = "UpdateProjectIncrementalConfiguration", action = "http://Checkmarx.com/v7/UpdateProjectIncrementalConfiguration")
    @WebResult(name = "UpdateProjectIncrementalConfigurationResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "UpdateProjectIncrementalConfiguration", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.UpdateProjectIncrementalConfiguration")
    @ResponseWrapper(localName = "UpdateProjectIncrementalConfigurationResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.UpdateProjectIncrementalConfigurationResponse")
    public CxWSBasicRepsonse updateProjectIncrementalConfiguration(
        @WebParam(name = "sessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID,
        @WebParam(name = "projectID", targetNamespace = "http://Checkmarx.com/v7")
        long projectID,
        @WebParam(name = "projectConfiguration", targetNamespace = "http://Checkmarx.com/v7")
        ProjectConfiguration projectConfiguration);

    /**
     * 
     * @param lcid
     * @param applicationCredentials
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSResponseLoginData
     */
    @WebMethod(operationName = "Login", action = "http://Checkmarx.com/v7/Login")
    @WebResult(name = "LoginResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "Login", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.LoginResponse")
    public CxWSResponseLoginData login(
        @WebParam(name = "applicationCredentials", targetNamespace = "http://Checkmarx.com/v7")
        Credentials applicationCredentials,
        @WebParam(name = "lcid", targetNamespace = "http://Checkmarx.com/v7")
        int lcid);

    /**
     * 
     * @param sessionID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSResponseGroupList
     */
    @WebMethod(operationName = "GetAssociatedGroupsList", action = "http://Checkmarx.com/v7/GetAssociatedGroupsList")
    @WebResult(name = "GetAssociatedGroupsListResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "GetAssociatedGroupsList", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetAssociatedGroupsList")
    @ResponseWrapper(localName = "GetAssociatedGroupsListResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetAssociatedGroupsListResponse")
    public CxWSResponseGroupList getAssociatedGroupsList(
        @WebParam(name = "SessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @param runId
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSResponseScanStatus
     */
    @WebMethod(operationName = "GetStatusOfSingleScan", action = "http://Checkmarx.com/v7/GetStatusOfSingleScan")
    @WebResult(name = "GetStatusOfSingleScanResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "GetStatusOfSingleScan", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetStatusOfSingleScan")
    @ResponseWrapper(localName = "GetStatusOfSingleScanResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetStatusOfSingleScanResponse")
    public CxWSResponseScanStatus getStatusOfSingleScan(
        @WebParam(name = "sessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID,
        @WebParam(name = "runId", targetNamespace = "http://Checkmarx.com/v7")
        String runId);

    /**
     * 
     * @param reportRequest
     * @param sessionID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSCreateReportResponse
     */
    @WebMethod(operationName = "CreateScanReport", action = "http://Checkmarx.com/v7/CreateScanReport")
    @WebResult(name = "CreateScanReportResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "CreateScanReport", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.CreateScanReport")
    @ResponseWrapper(localName = "CreateScanReportResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.CreateScanReportResponse")
    public CxWSCreateReportResponse createScanReport(
        @WebParam(name = "sessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID,
        @WebParam(name = "reportRequest", targetNamespace = "http://Checkmarx.com/v7")
        CxWSReportRequest reportRequest);

    /**
     * 
     * @param sessionID
     * @param reportID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSReportStatusResponse
     */
    @WebMethod(operationName = "GetScanReportStatus", action = "http://Checkmarx.com/v7/GetScanReportStatus")
    @WebResult(name = "GetScanReportStatusResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "GetScanReportStatus", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetScanReportStatus")
    @ResponseWrapper(localName = "GetScanReportStatusResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetScanReportStatusResponse")
    public CxWSReportStatusResponse getScanReportStatus(
        @WebParam(name = "SessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID,
        @WebParam(name = "ReportID", targetNamespace = "http://Checkmarx.com/v7")
        long reportID);

    /**
     * 
     * @param sessionID
     * @param reportID
     * @return
     *     returns com.checkmarx.cxviewer.ws.generated.CxWSResponseScanResults
     */
    @WebMethod(operationName = "GetScanReport", action = "http://Checkmarx.com/v7/GetScanReport")
    @WebResult(name = "GetScanReportResult", targetNamespace = "http://Checkmarx.com/v7")
    @RequestWrapper(localName = "GetScanReport", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetScanReport")
    @ResponseWrapper(localName = "GetScanReportResponse", targetNamespace = "http://Checkmarx.com/v7", className = "com.checkmarx.cxviewer.ws.generated.GetScanReportResponse")
    public CxWSResponseScanResults getScanReport(
        @WebParam(name = "SessionID", targetNamespace = "http://Checkmarx.com/v7")
        String sessionID,
        @WebParam(name = "ReportID", targetNamespace = "http://Checkmarx.com/v7")
        long reportID);

}
