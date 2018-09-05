package ut.com.mraddon.enchantments.conf;

import org.junit.Test;
import com.mraddon.enchantments.conf.api.MyPluginComponent;
import com.mraddon.enchantments.conf.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}