package com.checkmarx.cxconsole.utils;

import java.io.File;
import java.util.Map;

import com.checkmarx.cxconsole.commands.GeneralScanCommand;
import com.checkmarx.cxconsole.commands.ScanCommand;
//import com.checkmarx.cxconsole.commands.ScanFolderCommand;
//import com.checkmarx.cxconsole.commands.ScanProjectCommand;
import org.apache.commons.cli.CommandLine;

/**
 * Parameter container for 
 * 
 * @author Oleksiy Mysnyk
 *
 */
public class ScanParams {
	
	private String host;
	private String user;
	private String password;
	private String srcPath;
	private String projName;
	private String fullProjName;
	private String folderProjName;
	private String presetName;
	private String xmlFile;
	private String reportFile;
	private String reportType;
	private String logFile = "cx_scan.log";
	private boolean isVerbose = false;
	private boolean isVisibleOthers = true;
	private boolean isValidateFix = false;
	private String spFolderName;
	private LocationType locationType;
	private String locationPath;
	private String scanComment;
	private String locationURL;
	private Integer locationPort;
	//private String locationRepository;
	private String locationBranch;
	private String locationUser;
	private String locationPassword;
	private String locationPublicKey;
	private String locationPrivateKey;
	private String publicKey;
	private String privateKey;
	private String configuration;
	private String[] excludedFolders;
	private boolean hasExcludedParam = false;
    private String[] excludedExtensions;
    private boolean hasExcludedExtensionsParam = false;
    private boolean isSsoLoginUsed = false;
    private boolean hasPasswordParam = false;
    private boolean hasUserParam = false;

	
	public ScanParams(CommandLine commandLine) {
		this.host = commandLine.getOptionValue(ScanCommand.PARAM_HOST.getOpt());
		this.user = commandLine.getOptionValue(ScanCommand.PARAM_USER.getOpt());;
		this.password = commandLine.getOptionValue(ScanCommand.PARAM_PASSWORD.getOpt());;
		/*this.srcPath =  params.get(ScanCommand.PARAM_PROJ_DIR.toUpperCase());
		if (srcPath != null && srcPath.endsWith(File.separator)) {
			srcPath = srcPath.substring(0, srcPath.length() - 1);
		}*/
		this.presetName =  commandLine.getOptionValue(ScanCommand.PARAM_PRESET.getOpt());

		this.xmlFile = commandLine.getOptionValue(ScanCommand.PARAM_XML_FILE.getOpt());

		if (commandLine.hasOption(ScanCommand.PARAM_PDF_FILE.getOpt())) {
			this.reportType="PDF";
			this.reportFile = commandLine.getOptionValue(ScanCommand.PARAM_PDF_FILE.getOpt());
		}
		
		if (commandLine.hasOption(ScanCommand.PARAM_CSV_FILE.getOpt())) {
			this.reportType = "CSV";
			this.reportFile =  commandLine.getOptionValue(ScanCommand.PARAM_CSV_FILE.getOpt());
		}
		
		if (commandLine.hasOption(ScanCommand.PARAM_RTF_FILE.getOpt())) {
			this.reportType = "RTF";
			this.reportFile = commandLine.getOptionValue(ScanCommand.PARAM_RTF_FILE.getOpt());
		}
		
		this.logFile = commandLine.getOptionValue(ScanCommand.PARAM_LOG_FILE.getOpt());
        isVerbose = commandLine.hasOption(ScanCommand.PARAM_VERBOSE.getOpt());

		/*this.folderProjName = params.get(ScanCommand.PARAM_FOLDER_PRJ_NAME.toUpperCase());
		if (this.folderProjName!=null) {
			this.folderProjName = this.folderProjName.replaceAll("/","\\\\");
		}*/
		
		/*if (params.containsKey(ScanCommand.PARAM_VISIBLE_OTHERS.toUpperCase())){
			this.isVisibleOthers = true;
		}*/
		
		//Scan Project params
		//this.projName = params.get(ScanCommand.PARAM_PRJ.toUpperCase());
		/*if (params.containsKey(ScanProjectCommand.PARAM_VALIDATE.toUpperCase())) {
			isValidateFix = true;
		}*/
		//this.spFolderName = params.get(ScanCommand.PARAM_FOLDER_NAME.toUpperCase());
		
		//Scan command
		fullProjName =  commandLine.getOptionValue(ScanCommand.PARAM_PRJ_NAME.getOpt()); //params.get(ScanCommand.PARAM_PRJ_NAME.toUpperCase());
		if (fullProjName != null) {
			fullProjName = fullProjName.replaceAll("/","\\\\");
			String parts[] = fullProjName.split("\\\\");
			if (parts == null || !(parts.length > 0)) {
				projName = fullProjName;
			} else {
				projName = parts[parts.length - 1];
			} 
		}

        if (commandLine.hasOption(ScanCommand.PARAM_LOCATION_TYPE.getOpt()))
        {
		    locationType = LocationType.byName(commandLine.getOptionValue(ScanCommand.PARAM_LOCATION_TYPE.getOpt()));
        }
		
		scanComment=commandLine.getOptionValue(ScanCommand.PARAM_SCAN_COMMENT.getOpt());
		
		locationPath = commandLine.getOptionValue(ScanCommand.PARAM_LOCATION_PATH.getOpt());
		if (locationType == LocationType.folder && locationPath != null) {
			File resultFile = new File(locationPath);
			if (!resultFile.isAbsolute()) {
				String path = System.getProperty("user.dir");
				locationPath = path + File.separator + locationPath;
			}
		}
		locationUser = commandLine.getOptionValue(ScanCommand.PARAM_LOCATION_USER.getOpt());
		locationPassword = commandLine.getOptionValue(ScanCommand.PARAM_LOCATION_PWD.getOpt());
		locationURL = commandLine.getOptionValue(ScanCommand.PARAM_LOCATION_URL.getOpt());
		locationBranch = commandLine.getOptionValue(ScanCommand.PARAM_LOCATION_BRANCH.getOpt());
		locationPublicKey = commandLine.getOptionValue(ScanCommand.PARAM_LOCATION_PUBLIC_KEY.getOpt());
		locationPrivateKey = commandLine.getOptionValue(ScanCommand.PARAM_LOCATION_PRIVATE_KEY.getOpt());
		if (locationPrivateKey != null) {
			File resultFile = new File(locationPrivateKey);
			if (!resultFile.isAbsolute()) {
				String path = System.getProperty("user.dir");
				locationPrivateKey = path + File.separator + locationPrivateKey;
			}
		}
		if (locationPublicKey != null) {
			File resultFile = new File(locationPublicKey);
			if (!resultFile.isAbsolute()) {
				String path = System.getProperty("user.dir");
				locationPublicKey = path + File.separator + locationPublicKey;
			}
		}
		if (commandLine.hasOption(ScanCommand.PARAM_LOCATION_PORT.getOpt())) {
			String portStr = commandLine.getOptionValue(ScanCommand.PARAM_LOCATION_PORT.getOpt());
			try {
				locationPort = Integer.parseInt(portStr);
			} catch (Exception e) {
				// ignore
			}
		} else {
			if (locationType == LocationType.svn) {
				locationPort = 80;
			} else if (locationType == LocationType.tfs) {
				locationPort = 8080;
			}
		}
		presetName =  commandLine.getOptionValue(ScanCommand.PARAM_PRESET.getOpt());
		configuration =  commandLine.getOptionValue(ScanCommand.PARAM_CONFIGURATION.getOpt());
	    isValidateFix = commandLine.hasOption(ScanCommand.PARAM_INCREMENTAL.getOpt());
		isVisibleOthers = !commandLine.hasOption(ScanCommand.PARAM_PRIVATE.getOpt());
        isSsoLoginUsed = commandLine.hasOption(ScanCommand.PARAM_USE_SSO.getOpt());
        hasUserParam = commandLine.hasOption(ScanCommand.PARAM_USER.getOpt());
        hasPasswordParam = commandLine.hasOption(ScanCommand.PARAM_PASSWORD.getOpt());

		if (commandLine.hasOption(ScanCommand.PARAM_EXCLUDE.getOpt())){
			hasExcludedParam = true;
			excludedFolders = commandLine.getOptionValues(ScanCommand.PARAM_EXCLUDE.getOpt());
		}

        if (commandLine.hasOption(ScanCommand.PARAM_EXCLUDED_EXTENSIONS.getOpt()))
        {
            hasExcludedExtensionsParam = true;
            excludedExtensions = commandLine.getOptionValues(ScanCommand.PARAM_EXCLUDED_EXTENSIONS.getOpt());
        }
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getReportType() {
		return reportType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSrcPath() {
		return srcPath;
	}

	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}

	public String getPresetName() {
		return presetName;
	}

	public void setPresetName(String presetName) {
		this.presetName = presetName;
	}

	public String getXmlFile() {
		return xmlFile;
	}

	public void setXmlFile(String xmlFile) {
		this.xmlFile = xmlFile;
	}

	public String getReportFile() {
		return reportFile;
	}

	public void setReportFile(String file) {
		this.reportFile = file;
	}

	public String getLogFile() {
		return logFile;
	}

	public void setLogFile(String logFile) {
		this.logFile = logFile;
	}

	public boolean isVerbose() {
		return isVerbose;
	}

	public void setVerbose(boolean isVerbose) {
		this.isVerbose = isVerbose;
	}
	
	public String getProjName() {
		return projName;
	}
	
	public String getFullProjName() {
		return fullProjName;
	}
	
	public void setProjName(String projName) {
		this.projName = projName;
	}
	
	public String getFolderProjName() {
		return folderProjName;
	}
	
	public void setProjFolderName(String projFolderName) {
		this.folderProjName = projFolderName;
	}
	
	public boolean isVisibleOthers() {
		return isVisibleOthers;
	}
	
	public boolean isValidateFix() {
		return isValidateFix;
	}
	
	public String getSpFolderName() {
		return spFolderName;
	}
	
	public String getScanComment() {
		return scanComment;
	}

	public LocationType getLocationType() {
		return locationType;
	}
	
	public void setLocationType(LocationType type) {
		locationType=type;
	}

	public String getLocationPath() {
		return locationPath;
	}
	
	public void setLocationPath(String locationPath) {
		this.locationPath = locationPath;
	}

	public String getLocationURL() {
		return locationURL;
	}

//	public String getLocationRepository() {
//		return locationRepository;
//	}
		
	public String getLocationBranch() {
		return locationBranch;
	}

	public Integer getLocationPort() {
		return locationPort;
	}
	
	public String getLocationUser() {
		return locationUser;
	}

	public String getLocationPassword() {
		return locationPassword;
	}

	public String getLocationPublicKey() {
		return locationPublicKey;
	}

	public String getLocationPrivateKey() {
		return locationPrivateKey;
	}

	public String getConfiguration() {
		return configuration;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String[] getExcludedFolders() {
		return excludedFolders;
	}

	public void setExcludedFolders(String[] excludedFolders) {
		this.excludedFolders = excludedFolders;
	}

	public boolean hasExcludedParam() {
		return hasExcludedParam;
	}

	public void setHasExcludedParam(boolean hasExcludedParam) {
		this.hasExcludedParam = hasExcludedParam;
	}

    public String[] getExcludedExtensions() {
        return excludedExtensions;
    }

    public boolean hasExcludedExtensionsParam() {
        return hasExcludedExtensionsParam;
    }

    public boolean isSsoLoginUsed(){
        return isSsoLoginUsed;
    }

    public boolean hasUserParam(){
        return hasUserParam;
    }

    public boolean isHasPasswordParam(){
        return hasPasswordParam;
    }
}
