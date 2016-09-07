(ns clgs.core
  (:require [cljs.tools.reader :refer [read-string]]
            [cljs.js :refer [empty-state eval js-eval]]))

(def st (cljs.js/empty-state))

;(set! *print-fn*     (fn [& args] (.log js/Logger (str args))))
;(set! *print-err-fn* (fn [& args] (.log js/Logger (js-eval args))))

(defn ^:export evalCljs [s]
  (.log js/Logger (str "cljs in: " s))
  (eval st
        (read-string s)
        {:eval       js-eval
         ;:ns 'x.core
         ;:source-map true
         :context    :expr
         }
        (fn [result]
          (.log js/Logger (str "cljs out: " result)) 
          (:value result))))

(defn ^:export evalCljsAndArgs [s v]
  (.log js/Logger (str "cljs in: " s))
  (eval st
        (read-string (str "(" s " " v ")\n"))
        {:eval       js-eval
         :ns 'x.core
         :source-map true
         :context    :expr}
        (fn [result]
          (.log js/Logger (str "cljs out: " result)) 
          (:value result))))
