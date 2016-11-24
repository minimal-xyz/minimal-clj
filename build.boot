
(set-env! :dependencies '[[org.clojure/clojure "1.8.0"]]
          :source-paths #{"src/"})

(deftask build []
  (comp
    (aot :all true)
    (pom :project 'demo :version "0.1.0")
    (uber)
    (jar :main 'demo.main)
    (target)))
