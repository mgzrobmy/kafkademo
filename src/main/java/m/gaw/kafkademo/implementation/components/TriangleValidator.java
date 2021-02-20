package m.gaw.kafkademo.implementation.components;

import m.gaw.kafkademo.abstraction.components.Validator;
import m.gaw.kafkademo.implementation.model.Triangle;
import org.springframework.stereotype.Component;

@Component
public class  TriangleValidator implements Validator<Triangle> {

    public boolean isValid(Triangle triangle) {
        return triangle.canBeConstructed();
    }

}
