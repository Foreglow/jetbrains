# Foreglow Theme Pack — JetBrains

Unofficial JetBrains port of [Foreglow/visual-studio-code](https://github.com/Foreglow/visual-studio-code):
four twilight-inspired variants — **Foreglow** (dark), **Afterglow** (light),
**Alpenglow** (rubescent), **Airglow** (auroral).

Each variant pairs a UI theme (`*.theme.json`) with a matching editor color
scheme (`*.xml`) under `src/main/resources/themes/`, wired together by
`src/main/resources/META-INF/plugin.xml`.

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

MIT, matching the original Foreglow VS Code theme.
