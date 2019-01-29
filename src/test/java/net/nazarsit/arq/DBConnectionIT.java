package net.nazarsit.arq;

import net.nazarsit.arq.base.BaseArquillianIT;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.*;

@RunWith(Arquillian.class)
public class DBConnectionIT {

    @Deployment
    public static WebArchive createDeployment() {
        return BaseArquillianIT.createBaseDeployment();
    }

    @Resource(lookup = "env/foo")
    private String environment;

    @Test
    public void assertTrue(){
        System.out.println("environment = " + environment);
        System.out.println("environment getEnv() = " + System.getenv("foo"));
        assertThat(true).isTrue();
    }
}
