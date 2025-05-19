package ca.saraev.addon;

import ca.saraev.addon.modules.ExtraElytra;
import ca.saraev.addon.modules.AutoExtinguish;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Extra");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Extra");

        // Modules
        Modules.get().add(new ExtraElytra());
        Modules.get().add(new AutoExtinguish());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "ca.saraev.addon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("stefansaraev", "meteor-addon-seo");
    }
}
