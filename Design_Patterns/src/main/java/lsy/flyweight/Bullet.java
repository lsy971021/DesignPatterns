package lsy.flyweight;

import java.util.UUID;

/**
 * @author lsy
 */
public class Bullet {
    boolean living = true;
    UUID uuid = UUID.randomUUID();

    @Override
    public String toString() {
        return "Bullet{" +
                "uuid=" + uuid +
                '}';
    }
}
