package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dao2")
@Profile("dev")
// Variante A - @Primary : décommenter pour rendre cette implémentation prioritaire
// @Primary
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        return 150.0;
    }
}

