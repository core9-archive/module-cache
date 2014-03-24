package io.core9.plugin.cache;


import org.infinispan.Cache;

import io.core9.core.plugin.Core9Plugin;

public interface Core9Cache extends Core9Plugin {

	Core9Cache getCache();

	Cache<String, Object> getInfinispanCache();

}
