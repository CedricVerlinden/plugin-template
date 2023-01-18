```diff
-This repository is currently no longer being maintained
```

# Minecraft Plugin Template

[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)
[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)

A barebone Minecraft plugin template using Maven and the PaperMC API on Java 17 for Minecraft 1.19.2.

# Table of contents

- [Installation](#installation)
- [Configurating](#configurating)
- [Changing your API](#Changing-your-API)
- [Updating](#Updating)
- [License](#license)

# Installation

I will be using the GitHub desktop application, you can get it [here](https://desktop.github.com/).

1. Click on `File` in the top left corner.


2. Select the `URL` tab and paste the link to this repository into `Repository URL or GitHub username and repository`


3. Press the `Clone` button and you are done.

# Configurating

1. The first thing that you want to do is changing your package name. You can do this by right-clicking
   on `your.packagename.pluginname` and selecting `Refractor -> Rename`. Now you also want to change your package name
   in your `pom.xml` here:

   ```
    <groupId>your.packagename</groupId>
    ```

   ```
    <main.class>your.packagename.pluginname.PluginName</main.class>
   ```


2. Next you want to set your plugin's name. Do this by both changing `pluginname` after your package name and going into
   your `pom.xml` and changing these three values:

    ```
    <artifactId>pluginname</artifactId>
   ```

   ```
    <name>PluginName</name>
   ```

   ```
    <main.class>your.packagename.pluginname.PluginName</main.class>
   ```

If all done correctly, you should see your project name change to your plugin name next your `pom.xml`:

![pom.xml](https://i.imgur.com/h2lHivk.png)

# Changing your API

The default API that this plugin template uses is PaperMC but there is also a SpigotMC API provided within the `pom.xml`
file. Here is how to change it:

1. We well be looking at the `repositories` section first. Start by commenting out this section:

    ```
   <repository>
       <id>papermc</id>
       <url>https://repo.papermc.io/repository/maven-public/</url>
   </repository>
   ```

2. Next you can uncomment this section:

    ```
    <repository>
        <id>spigot-repo</id>
        <url>https://hub.spigotmc.org/nexus/content/repositories/snapshots/</url>
    </repository>
   ```

3. Now for the `dependencies` section, it is exactly the same. Start by commenting out the PaperMC dependency:

    ```
   <dependency>
       <groupId>io.papermc.paper</groupId>
       <artifactId>paper-api</artifactId>
       <version>1.19.2-R0.1-SNAPSHOT</version>
       <scope>provided</scope>
   </dependency>
   ```

4. Uncomment the SpigotMC API dependency:

    ```
   <dependency>
       <groupId>org.spigotmc</groupId>
       <artifactId>spigot-api</artifactId>
       <version>1.19.2-R0.1-SNAPSHOT</version>
       <scope>provided</scope>
   </dependency>
   ```

5. After that you can start using the SpigotMC API.

# Updating

Everything that needs to be updated can be found in your `pom.xml` file.

### Maven Dependencies

* In the plugin section, you will find three plugins that require the plugin to compile using maven, make sure to keep
  an eye out on new updates via the provided links next to the versions.

### Minecraft Dependencies

* There will only be one that you will need to update, and that is either the PaperMC or SpigotMC API. You can, again,
  check out the latest version via the provided links.

# License

The GNU General Public License v3.0 (GNU GPLv3) 2007 - [Free Software Foundation](https://fsf.org/).
Please have a look at the [LICENSE.md](LICENSE.md) for more details.
