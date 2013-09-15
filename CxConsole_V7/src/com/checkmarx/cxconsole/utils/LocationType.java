package com.checkmarx.cxconsole.utils;

import com.checkmarx.cxviewer.ws.generated.SourceLocationType;

public enum LocationType {

	folder("folder"),
	shared("shared"),
	//tsf_svn("TFS/SVN"),
	tfs("TFS"),
	svn("SVN"),
	git("GIT");
	
	private String locationType;
	
	LocationType(String location) {
		this.locationType = location;
	}
	
	public static LocationType byName(String name) {
		LocationType[] vals = values();
		
		for (LocationType value : vals) {
			if (value.locationType.equalsIgnoreCase(name)) {
				return value;
			}
		}
		return null;
	}
	
	public String getLocationType() {
		return locationType;
	}
	
	public SourceLocationType getCorrespondingType() {
		switch (this) {
			case folder:
				return SourceLocationType.LOCAL;
			case shared:
				return SourceLocationType.SHARED;
			case tfs:
			case svn:
			case git:
				return SourceLocationType.SOURCE_CONTROL;
		}
		
		return null;
	}
}
