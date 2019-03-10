(defproject clj-omnibus "0.1.0-SNAPSHOT"
	:description "An omnibus of clojure knowledge"
    :repositories {"sonartype snapshots" "https://oss.sonatype.org/content/repositories/snapshots"} ;;This allow us to add maven repositories as normal clojure deps
	:dependencies [[org.clojure/clojure "1.7.0"]]
	:repl-options {
		:init-ns clj-omnibus
		:prompt (fn [ns] (str "\033[00;35m" ns "\033[00m=> " ))
		:welcome (println "type \"(help)\" for help.")})