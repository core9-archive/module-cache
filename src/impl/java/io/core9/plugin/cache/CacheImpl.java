package io.core9.plugin.cache;

import net.xeoh.plugins.base.annotations.PluginImplementation;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

@PluginImplementation
public class CacheImpl implements Core9Cache {
	
	private Cache<String, Object> cache = new DefaultCacheManager().getCache();

	@Override
	public Core9Cache getCache(){
		return this;
	}
	
	@Override
	public Cache<String, Object> getInfinispanCache(){
		return cache;
	}
	
}
