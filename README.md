<p align="center"><img width="320" alt="foreglow-logo" src="https://github.com/user-attachments/assets/5b0f629b-9800-4c97-b23b-fa3f22681ea4" /></p>

<h3 align="center">Foreglow Theme for <a href="https://www.jetbrains.com/">JetBrains</a></h3>

<p align="center">
  <a href="https://github.com/Foreglow/jetbrains/stargazers"><img src="https://img.shields.io/github/stars/Foreglow/jetbrains?style=for-the-badge&labelColor=313244&color=CB81E4" alt="Stars" /></a>
  <a href="https://github.com/Foreglow/jetbrains/issues"><img src="https://img.shields.io/github/issues/Foreglow/jetbrains?style=for-the-badge&labelColor=313244&color=8930A6" alt="Issues" /></a>
  <a href="https://github.com/Foreglow/jetbrains/graphs/contributors"><img src="https://img.shields.io/github/contributors/Foreglow/jetbrains?style=for-the-badge&labelColor=313244&color=FF6B8A" alt="Contributors" /></a>
  <a href="https://github.com/Foreglow/jetbrains/blob/master/LICENSE"><img src="https://img.shields.io/github/license/Foreglow/jetbrains?style=for-the-badge&labelColor=313244&color=2EE8C8" alt="License" /></a>
</p>

<p align="center"><img width="640" alt="foreglow-pack" src="https://github.com/user-attachments/assets/6075ceb9-b2ff-49e1-9e1c-c3673605892f" /></p>

## Previews

<details>
  <summary>🌃 Foreglow</summary>
  <img width="1342" height="906" alt="foreglow" src="https://github.com/user-attachments/assets/f6153e54-6c34-47a4-aa43-6289dcac7892" />
</details>

<details>
  <summary>🌇 Afterglow</summary>
  <img width="1342" height="906" alt="afterglow" src="https://github.com/user-attachments/assets/7dac74e3-0063-48af-aa20-6dd3be3309e1" />
</details>

<details>
  <summary>🌉 Alpenglow</summary>
  <img width="1342" height="906" alt="alpenglow" src="https://github.com/user-attachments/assets/eec2f850-dbca-40c2-98be-0b6098706c4c" />
</details>

<details>
  <summary>🌌 Airglow</summary>
  <img width="1342" height="906" alt="airglow" src="https://github.com/user-attachments/assets/a40bf2cd-df68-4f80-bdad-df715ec4605a" />
</details>

A twilight-inspired theme for JetBrains, with four variants:
**Foreglow** (dark-dawn), **Afterglow** (light-dusk), **Alpenglow**
(rubescent), and **Airglow** (auroral).

## Install from JetBrains Marketplace

The Foreglow Theme Pack is available on the [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/34226-foreglow-theme-pack).

## Build

```
./gradlew buildPlugin
```

Produces the distributable plugin zip under `build/distributions/`.

## Try it locally without building a distribution

```
./gradlew runIde
```

Launches a sandboxed IDE instance with the theme pack already installed, for
quick iteration.

## Install the built plugin

Settings/Preferences → Plugins → ⚙️ → Install Plugin from Disk… → pick the
zip from `build/distributions/`, then restart. Then Settings → Appearance &
Behavior → Appearance → Theme, and pick a variant.

See [INSTALL.md](INSTALL.md) for more detail, including the editor-scheme-only
path that skips the plugin entirely.

## Layout

```
src/main/
├── kotlin/                # empty — no plugin logic, theme-only
└── resources/
    ├── META-INF/
    │   └── plugin.xml      # themeProvider + bundledColorScheme wiring
    └── themes/
        ├── Foreglow.xml
        ├── Foreglow.theme.json
        ├── Afterglow.xml
        ├── Afterglow.theme.json
        ├── Alpenglow.xml
        ├── Alpenglow.theme.json
        ├── Airglow.xml
        └── Airglow.theme.json
```

## License

MIT © [Foreglow](https://github.com/Foreglow)
