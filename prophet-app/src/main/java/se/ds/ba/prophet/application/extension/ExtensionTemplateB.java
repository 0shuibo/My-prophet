package se.ds.ba.prophet.application.extension;

import com.alibaba.cola.extension.Extension;
import se.ds.ba.prophet.application.extension.extpt.SomeExtPt;
import org.springframework.stereotype.Component;

/**
 * @author peihua
 * **/

@Extension(bizId = "B")
@Component
public class ExtensionTemplateB implements SomeExtPt {

    @Override
    public void doSomeThing() {
        System.out.println("SomeExtensionB::doSomething");
    }

}
