(ns lein-merge-services.plugin)

(defn middleware
  [project]
  (assoc-in project [:uberjar-merge-with #"^META-INF/services/"]
            '[#(-> % (slurp) (clojure.string/trim) (str \newline))
              str
              spit]))
