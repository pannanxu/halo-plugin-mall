package io.mvvm.halo.plugins.mall;

import org.pf4j.PluginWrapper;
import org.springframework.stereotype.Component;
import run.halo.app.plugin.BasePlugin;

/**
 * HaloPluginMall.
 *
 * @author: pan
 **/
@Component
public class HaloPluginMall extends BasePlugin {
    
    public static final String name = "mall";
    
    public HaloPluginMall(PluginWrapper wrapper) {
        super(wrapper);
    }
    
    @Override
    public void start() {
        System.out.println("插件启动成功！");
    }
    
    @Override
    public void stop() {
        System.out.println("插件停止！");
    }
}
