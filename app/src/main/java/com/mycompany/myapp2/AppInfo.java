package com.mycompany.myapp2;

import android.graphics.drawable.*;

public class AppInfo
 {

	private Drawable icon;// 应用图标
	private String appName;// 应用名称
	private String packageName;// 包名
	private String appSize;

	public AppInfo(Drawable icon, String appName, String packageName) {
		super();
		this.icon = icon;
		this.appName = appName;
		this.packageName = packageName;
	}

	public AppInfo() {
		super();
	}

	public void setAppSize(String appSize)
	{
		this.appSize = appSize;
	}

	public String getAppSize()
	{
		return appSize;
	}

	public Drawable getIcon() {
		return icon;
	}

	public void setIcon(Drawable icon) {
		this.icon = icon;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	@Override
	public String toString() {
		return "AppInfo [icon=" + icon + ", appName=" + appName
			+ ", packageName=" + packageName + "]";
	}

}
