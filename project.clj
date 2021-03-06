(defproject hello-canvas "0.1.0-SNAPSHOT"
  :description "A simple canvas clojurescript experiment"
  :url "http://github.com/rogerallen/hello_canvas"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1978"]]

  :plugins [[lein-cljsbuild "0.3.4"]]

  :source-paths ["src"]

  :cljsbuild {:builds [{:id "hello-canvas"
                        :source-paths ["src"]
                        :compiler {:output-to     "hello_canvas_js/hello_canvas.js"
                                   :output-dir    "hello_canvas_js"
                                   :optimizations :none
                                   :source-map    true}}]})
