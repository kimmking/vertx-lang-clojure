(ns io.vertx.clojure.core.net.tcpssl-options)

(import io.vertx.core.net.TCPSSLOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new TCPSSLOptions))
  ([^JsonObject json] (new TCPSSLOptions json)))

(defn add-crl-path [^TCPSSLOptions t-cpssl-options crl-paths] (.addCrlPath t-cpssl-options crl-paths))
(defn get-crl-paths [^TCPSSLOptions t-cpssl-options] (.getCrlPaths t-cpssl-options))
(defn add-crl-value [^TCPSSLOptions t-cpssl-options crl-values] (.addCrlValue t-cpssl-options crl-values))
(defn get-crl-values [^TCPSSLOptions t-cpssl-options] (.getCrlValues t-cpssl-options))
(defn add-enabled-cipher-suite [^TCPSSLOptions t-cpssl-options enabled-cipher-suites] (.addEnabledCipherSuite t-cpssl-options enabled-cipher-suites))
(defn get-enabled-cipher-suites [^TCPSSLOptions t-cpssl-options] (.getEnabledCipherSuites t-cpssl-options))
(defn add-enabled-secure-transport-protocol [^TCPSSLOptions t-cpssl-options enabled-secure-transport-protocols] (.addEnabledSecureTransportProtocol t-cpssl-options enabled-secure-transport-protocols))
(defn get-enabled-secure-transport-protocols [^TCPSSLOptions t-cpssl-options] (.getEnabledSecureTransportProtocols t-cpssl-options))
(defn set-idle-timeout [^TCPSSLOptions t-cpssl-options idle-timeout] (.setIdleTimeout t-cpssl-options idle-timeout))
(defn get-idle-timeout [^TCPSSLOptions t-cpssl-options] (.getIdleTimeout t-cpssl-options))
(defn set-jdk-ssl-engine-options [^TCPSSLOptions t-cpssl-options jdk-ssl-engine-options] (.setJdkSslEngineOptions t-cpssl-options jdk-ssl-engine-options))
(defn get-jdk-ssl-engine-options [^TCPSSLOptions t-cpssl-options] (.getJdkSslEngineOptions t-cpssl-options))
(defn set-key-store-options [^TCPSSLOptions t-cpssl-options key-store-options] (.setKeyStoreOptions t-cpssl-options key-store-options))
(defn get-key-store-options [^TCPSSLOptions t-cpssl-options] (.getKeyStoreOptions t-cpssl-options))
(defn set-log-activity [^TCPSSLOptions t-cpssl-options log-activity] (.setLogActivity t-cpssl-options log-activity))
(defn get-log-activity [^TCPSSLOptions t-cpssl-options] (.getLogActivity t-cpssl-options))
(defn set-open-ssl-engine-options [^TCPSSLOptions t-cpssl-options open-ssl-engine-options] (.setOpenSslEngineOptions t-cpssl-options open-ssl-engine-options))
(defn get-open-ssl-engine-options [^TCPSSLOptions t-cpssl-options] (.getOpenSslEngineOptions t-cpssl-options))
(defn set-pem-key-cert-options [^TCPSSLOptions t-cpssl-options pem-key-cert-options] (.setPemKeyCertOptions t-cpssl-options pem-key-cert-options))
(defn get-pem-key-cert-options [^TCPSSLOptions t-cpssl-options] (.getPemKeyCertOptions t-cpssl-options))
(defn set-pem-trust-options [^TCPSSLOptions t-cpssl-options pem-trust-options] (.setPemTrustOptions t-cpssl-options pem-trust-options))
(defn get-pem-trust-options [^TCPSSLOptions t-cpssl-options] (.getPemTrustOptions t-cpssl-options))
(defn set-pfx-key-cert-options [^TCPSSLOptions t-cpssl-options pfx-key-cert-options] (.setPfxKeyCertOptions t-cpssl-options pfx-key-cert-options))
(defn get-pfx-key-cert-options [^TCPSSLOptions t-cpssl-options] (.getPfxKeyCertOptions t-cpssl-options))
(defn set-pfx-trust-options [^TCPSSLOptions t-cpssl-options pfx-trust-options] (.setPfxTrustOptions t-cpssl-options pfx-trust-options))
(defn get-pfx-trust-options [^TCPSSLOptions t-cpssl-options] (.getPfxTrustOptions t-cpssl-options))
(defn set-receive-buffer-size [^TCPSSLOptions t-cpssl-options receive-buffer-size] (.setReceiveBufferSize t-cpssl-options receive-buffer-size))
(defn get-receive-buffer-size [^TCPSSLOptions t-cpssl-options] (.getReceiveBufferSize t-cpssl-options))
(defn set-reuse-address [^TCPSSLOptions t-cpssl-options reuse-address] (.setReuseAddress t-cpssl-options reuse-address))
(defn is-reuse-address [^TCPSSLOptions t-cpssl-options] (.isReuseAddress t-cpssl-options))
(defn set-reuse-port [^TCPSSLOptions t-cpssl-options reuse-port] (.setReusePort t-cpssl-options reuse-port))
(defn is-reuse-port [^TCPSSLOptions t-cpssl-options] (.isReusePort t-cpssl-options))
(defn set-send-buffer-size [^TCPSSLOptions t-cpssl-options send-buffer-size] (.setSendBufferSize t-cpssl-options send-buffer-size))
(defn get-send-buffer-size [^TCPSSLOptions t-cpssl-options] (.getSendBufferSize t-cpssl-options))
(defn set-so-linger [^TCPSSLOptions t-cpssl-options so-linger] (.setSoLinger t-cpssl-options so-linger))
(defn get-so-linger [^TCPSSLOptions t-cpssl-options] (.getSoLinger t-cpssl-options))
(defn set-ssl [^TCPSSLOptions t-cpssl-options ssl] (.setSsl t-cpssl-options ssl))
(defn is-ssl [^TCPSSLOptions t-cpssl-options] (.isSsl t-cpssl-options))
(defn set-tcp-cork [^TCPSSLOptions t-cpssl-options tcp-cork] (.setTcpCork t-cpssl-options tcp-cork))
(defn is-tcp-cork [^TCPSSLOptions t-cpssl-options] (.isTcpCork t-cpssl-options))
(defn set-tcp-fast-open [^TCPSSLOptions t-cpssl-options tcp-fast-open] (.setTcpFastOpen t-cpssl-options tcp-fast-open))
(defn is-tcp-fast-open [^TCPSSLOptions t-cpssl-options] (.isTcpFastOpen t-cpssl-options))
(defn set-tcp-keep-alive [^TCPSSLOptions t-cpssl-options tcp-keep-alive] (.setTcpKeepAlive t-cpssl-options tcp-keep-alive))
(defn is-tcp-keep-alive [^TCPSSLOptions t-cpssl-options] (.isTcpKeepAlive t-cpssl-options))
(defn set-tcp-no-delay [^TCPSSLOptions t-cpssl-options tcp-no-delay] (.setTcpNoDelay t-cpssl-options tcp-no-delay))
(defn is-tcp-no-delay [^TCPSSLOptions t-cpssl-options] (.isTcpNoDelay t-cpssl-options))
(defn set-tcp-quick-ack [^TCPSSLOptions t-cpssl-options tcp-quick-ack] (.setTcpQuickAck t-cpssl-options tcp-quick-ack))
(defn is-tcp-quick-ack [^TCPSSLOptions t-cpssl-options] (.isTcpQuickAck t-cpssl-options))
(defn set-traffic-class [^TCPSSLOptions t-cpssl-options traffic-class] (.setTrafficClass t-cpssl-options traffic-class))
(defn get-traffic-class [^TCPSSLOptions t-cpssl-options] (.getTrafficClass t-cpssl-options))
(defn set-trust-store-options [^TCPSSLOptions t-cpssl-options trust-store-options] (.setTrustStoreOptions t-cpssl-options trust-store-options))
(defn get-trust-store-options [^TCPSSLOptions t-cpssl-options] (.getTrustStoreOptions t-cpssl-options))
(defn set-use-alpn [^TCPSSLOptions t-cpssl-options use-alpn] (.setUseAlpn t-cpssl-options use-alpn))
(defn is-use-alpn [^TCPSSLOptions t-cpssl-options] (.isUseAlpn t-cpssl-options))
(defn set-use-pooled-buffers [^TCPSSLOptions t-cpssl-options use-pooled-buffers] (.setUsePooledBuffers t-cpssl-options use-pooled-buffers))
(defn is-use-pooled-buffers [^TCPSSLOptions t-cpssl-options] (.isUsePooledBuffers t-cpssl-options))
(defn to-json [^TCPSSLOptions t-cpssl-options] (.toJson t-cpssl-options))