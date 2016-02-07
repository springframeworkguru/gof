package guru.springframework.gof.strategy.strategies;

public interface EncryptionStrategy {
    void encryptData(String plainText);
}
