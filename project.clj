(defproject com.gfredericks/lein-merge-services "1.0.1-SNAPSHOT"
  :description "Leiningen plugin that merges /META-INF/services files during uberjar."
  :url "http://github.com/fredericksgary/lein-merge-services"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.3.4"
  :eval-in-leiningen true

  :plugins [[lein-release "1.0.5"]]
  :lein-release {:deploy-via :clojars})
