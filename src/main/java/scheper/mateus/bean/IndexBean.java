package scheper.mateus.bean;

import org.omnifaces.cdi.ViewScoped;

import javax.inject.Named;
import java.io.Serial;
import java.io.Serializable;

@Named
@ViewScoped
public class IndexBean implements Serializable {

    @Serial
    private static final long serialVersionUID = 8606272551167403647L;

    private String name;

    public void logarNome(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
