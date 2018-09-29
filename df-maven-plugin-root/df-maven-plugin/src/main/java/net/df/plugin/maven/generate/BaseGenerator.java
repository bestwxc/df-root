package net.df.plugin.maven.generate;

import net.df.plugin.maven.config.ModelConfiguration;

public abstract class BaseGenerator implements Generator{
    private ModelConfiguration configuration;

    public ModelConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ModelConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getBasePackage(){
        return this.configuration.getBasePackage();
    }

    public String getModuleName(){
        return this.configuration.getModuleName();
    }
    public String getModelClass(){
        return this.getBasePackage() + "." + this.getModuleName() + ".model."
                + this.configuration.getModelClassName();
    }

    public String getServiceClassName(){
        return this.configuration.getService().getServiceClassName();
    }

    public String getServiceClass(){
        return this.getBasePackage() + "." + this.getModuleName() + ".service."
                + this.configuration.getService().getServiceClassName();
    }

    public String getControllerClassName(){
        return this.configuration.getController().getControllerClassName();
    }

    public String getControllerClass(){
        return this.getBasePackage()+ "." + this.getModuleName() + ".controller."
                + this.configuration.getController().getControllerClassName();
    }
}
