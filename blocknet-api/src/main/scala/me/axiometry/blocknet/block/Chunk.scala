package me.axiometry.blocknet.block

import me.axiometry.blocknet._

trait Chunk extends WorldLocatable with ChunkLocatable {
  trait BlockAccess {
    def apply(loc: Location.Block): BlockState
    def update(loc: Location.Block, block: BlockState)
  }

  def blockAt: BlockAccess
}