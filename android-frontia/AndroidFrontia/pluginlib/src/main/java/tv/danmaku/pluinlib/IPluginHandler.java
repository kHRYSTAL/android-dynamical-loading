package tv.danmaku.pluinlib;

/**
 * Copyright (c) 2015 BiliBili Inc.
 * Created by user on 2016/4/8.
 */
public interface IPluginHandler {
	public int initPlugin(String pluginPath);

	public BasePluginPackage getPluginPackage(String packageName);

	public Class loadPluginClass(BasePluginPackage basePluginPackage, String className);
}
