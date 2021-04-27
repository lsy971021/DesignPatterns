package lsy.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lsy
 * 子弹池
 */
public class BulletPool {
    List<Bullet> list =new ArrayList<>();
    {
        for (int i = 0; i < 10; i++) {
            list.add(new Bullet());
        }
    }
    public Bullet gerBullet(){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).living) return list.get(i);
        }
        return new Bullet();
    }
}
