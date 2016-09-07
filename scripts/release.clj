(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:output-to "release/clgs.js"
     :output-dir "release"
     :optimizations :simple
     :verbose true
     :pretty-print false
     :optimize-constants true
     ;:static-fns true
     })
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
