# lein-merge-services

A Leiningen plugin that (during uberjar) merges any files under
`META-INF/services` by concattenating them.

## Usage

Put `[com.gfredericks/lein-merge-services "1.0.0"]` into the `:plugins` vector of your
`project.clj`.

## Assumptions

That this is a reasonable thing to do.

## License

Copyright © 2014 Gary Fredericks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
