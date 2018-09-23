package az.stepit.booking.registry;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AbstractFactory implements ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.setContext(applicationContext);
    }
    public <T> T get(String name, Class<T> clazz) {
        return context.getBean(name,clazz);
    }

    public <T> T get(Class<T> clazz) {
        return context.getBean(clazz);

    }
    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

}