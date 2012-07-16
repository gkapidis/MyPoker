import java.util.*;


	
	public enum HandEvaluator {
		RoyalFlush { 
			public Boolean is(CardHolder ch) {
				if (! StraightFlush.is(ch)) return false;
	
				return ch.getRankStats().containsKey(Rank.ACE);
			}
		},
		StraightFlush {
			public Boolean is(CardHolder ch) {
				return Straight.is(ch) && Flush.is(ch);
			}
		},
		FourOfAKind {
			public Boolean is(CardHolder ch) {
				if (!this.validate(ch)) {
					return false;
				}
				
				return ch.getRankStats().containsValue(4);
			}
		},
		FullHouse {
			public Boolean is(CardHolder ch) {
				if (!this.validate(ch)) {
					return false;
				}
				
				return ch.getRankStats().containsValue(3) && ch.getRankStats().containsValue(2);
			}
		},
		Flush {
			public Boolean is(CardHolder ch) {
				if (!this.validate(ch)) {
					return false;
				}
				
				return ch.getSuitStats().size() == 1;
			}
		},
		Straight {
			public Boolean is(CardHolder ch) {
				if (!this.validate(ch)) {
					return false;
				}
				
				if (ch.getRankStats().size() != 5) {
					return false;
				}
				return ch.getMaxRank().compareTo(ch.getMinRank()) == 4;
			}
		},
		ThreeOfAKind {
			public Boolean is(CardHolder ch) {
				if (!this.validate(ch)) {
					return false;
				}
				
				return ch.getRankStats().containsValue(3) && ch.getRankStats().containsValue(1);
			}
		},
		TwoPair {
			public Boolean is(CardHolder ch) {
				if (!this.validate(ch)) {
					return false;
				}
				
				return ch.getRankStats().containsValue(2) && ch.getRankStats().size() == 3;
			}
		},
		OnePair {
			public Boolean is(CardHolder ch) {
				if (!this.validate(ch)) {
					return false;
				}
				
				return ch.getRankStats().containsValue(2) && ch.getRankStats().size() == 4;
			}
		},
		HighCard {
			public Boolean is(CardHolder ch) {
				if (Straight.is(ch)) {
					return false;
				}
				
				return ch.getRankStats().size() == 5;
			}
		};
		
		/**
		 * @param hand
		 * @return
		 */
		public abstract Boolean is(CardHolder ch);
		
		/**
		 * @param hand
		 * @return
		 */
		static HandEvaluator of(CardHolder ch) {
			for (HandEvaluator ph: HandEvaluator.values()) {
				if (ph.is(ch)) return ph;
			}
			return null;
		}
		
		protected boolean validate(CardHolder ch) {
			return ch.getHand().size() == 5;
		}
	
}