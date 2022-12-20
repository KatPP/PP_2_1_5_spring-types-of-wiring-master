package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // бин данного класса конструируется через связывание по @Autowired с помощью конструктора с Rabbit4
public class Wood3 {

    private final Rabbit4 rabbit;

    @Autowired
    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}