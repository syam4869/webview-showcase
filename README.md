# WebView Showcase

A tiny experiment that demonstrates how to embed a system WebView inside a native desktop application.

## Goals
- Provide a minimal, well-documented example for loading local HTML/CSS/JS in a native window.
- Serve as a playground for experimenting with communication between Rust and the WebView.
- Share findings on desktop WebView capabilities and limitations.

## Features
- Opens a native window that displays bundled web content.
- Enables message passing between Rust and JavaScript.
- Uses a simple project structure that is easy to extend.

## Tech Stack
- **Rust** for the host application logic.
- **wry** (or another WebView library) for cross-platform WebView integration.
- **HTML**, **CSS**, and **JavaScript** for the user interface.

## Background
This repository began as a learning exercise for experimenting with lightweight desktop interfaces driven by web technologies. It collects notes and code snippets that make it easier to evaluate WebView-based workflows.

## Usage
1. Install [Rust](https://www.rust-lang.org/tools/install).
2. Clone this repository.
3. Run `cargo run` to launch the example window.
4. Modify the `index.html` file and re-run the project to see updates.

## Future Ideas
- Package the example as a standalone cross-platform application.
- Explore hot-reloading of front-end assets.
- Investigate bundling for mobile platforms.

## Author
syam (<syam4869@icloud.com>)

