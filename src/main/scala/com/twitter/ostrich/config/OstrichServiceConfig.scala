package com.twitter.ostrich
package config

import com.twitter.logging.Logger
import com.twitter.logging.config._
import com.twitter.ostrich.admin.{RuntimeEnvironment, ServiceTracker}
import com.twitter.ostrich.admin.config._
import com.twitter.util.Config

class OstrichServiceConfig extends ServerConfig[OstrichServiceServer] {
  var thriftPort: Int = 9999

  def apply(runtime: RuntimeEnvironment) = new OstrichServiceImpl(this)
}
