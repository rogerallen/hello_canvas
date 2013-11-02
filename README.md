# Hello Canvas

Just a toy to play with... A simple-minded ClojureScript animated
canvas drawing experiment based on David Nolen's mies leiningen
plugin.  See
http://swannodette.github.io/2013/10/27/the-essence-of-clojurescript/


Run this from a shell:
```shell
lein cljsbuild auto hello-canvas
```

Load file `hello_canvas.html` in your browser.  Just as a static file,
you don't need to do it via a webserver.

Edit `src/hello_canvas/core.cljs` if you would like to to draw
something different.

I renamed some files to make it easier to take the webpage and
copy it for use as a static page.  Like this:

```shell
cp -R hello_canvas* <destdir>
```

## License

Copyright © 2013 Roger Allen

Distributed under the Eclipse Public License, the same as Clojure.

[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/rogerallen/hello_canvas/trend.png)](https://bitdeli.com/free "Bitdeli Badge")
