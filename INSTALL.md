# Installing

## Option A — build and install the plugin (full UI theme + editor scheme)

1. `./gradlew buildPlugin`
2. In any JetBrains IDE: **Settings/Preferences → Plugins → ⚙️ → Install
   Plugin from Disk…** and select the zip generated under
   `build/distributions/`.
3. Restart the IDE when prompted.
4. **Settings → Appearance & Behavior → Appearance → Theme** → pick
   *Foreglow*, *Afterglow*, *Alpenglow*, or *Airglow*.
5. On the same Appearance page, the **Editor color scheme** dropdown shows
   the scheme marked as default for whichever theme you picked — select it
   there too. Picking the UI theme alone doesn't always auto-switch the
   editor's syntax-highlighting scheme; this is a JetBrains platform quirk
   with plugin-supplied themes, not specific to this pack.

## Option B — editor color scheme only, no plugin, no build

If you only care about syntax highlighting in the code editor and don't
want to install a plugin: **Settings → Editor → Color Scheme → ⚙️ → Import
Scheme → IntelliJ IDEA color scheme (.icls)**, and pick one of the
`src/main/resources/themes/*.xml` files directly.

## Notes

- The plugin is unsigned/local. Installing from disk shows an "unverified
  plugin" notice on some IDE versions — that's expected for a
  non-Marketplace plugin, not an error.
- `./gradlew runIde` launches a disposable sandboxed IDE with the plugin
  already installed, useful for previewing changes without repeating steps
  1–3 above every time.
