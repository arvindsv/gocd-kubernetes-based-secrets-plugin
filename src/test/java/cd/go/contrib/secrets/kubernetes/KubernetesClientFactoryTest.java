package cd.go.contrib.secrets.kubernetes;

import cd.go.contrib.secrets.kubernetes.models.SecretConfig;
import org.junit.jupiter.api.Test;

class KubernetesClientFactoryTest {
    @Test
    void shouldWorkWithARealK8sClient() {
        KubernetesClientFactory clientFactory = new KubernetesClientFactory();

        SecretConfig secretConfig = new SecretConfig();
        secretConfig.setNamespace("");
        secretConfig.setClusterCACertData("");
        secretConfig.setClusterUrl("");
        secretConfig.setSecurityToken("");
        secretConfig.setSecretName("");

        clientFactory.client(secretConfig);

        throw new RuntimeException("Expected this to fail in the previous line");
    }
}