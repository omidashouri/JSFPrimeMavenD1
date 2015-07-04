package ir.primefaces.showcase.view.input;

import ir.primefaces.showcase.lb.Theme;
import ir.primefaces.showcase.service.ThemeService;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ashouri on 7/4/2015.
 */

@Named
@RequestScoped
public class SelectOneView implements Serializable {

    private String option;
    private Theme theme;
    private List<Theme> themes;


    private ThemeService service;

    @PostConstruct
    public void init() {
        themes = service.getThemes();
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setService(ThemeService service) {
        this.service = service;
    }

}
