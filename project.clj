(defproject version-clj "0.1.0"
  :description "Version Number Analysis and Comparison for Clojure"
  :url "https://github.com/xsc/version-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:midje {:dependencies [[midje "1.5.1"]]
                     :plugins [[lein-midje "3.0.1"]]}}
  :aliases {"midje-dev" ["with-profile" "midje" "midje"]
            "deps-dev" ["with-profile" "midje" "deps"]})
