(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'clgs.core
   :output-to "out/clgs.js"
   :output-dir "out"})
