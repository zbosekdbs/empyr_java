/**
 * 
 */
package com.empyr.api.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.empyr.api.annotations.ApiField;
import com.empyr.api.annotations.Documented;

/**
 * @author jcuzens
 *
 */
@Documented( name="transaction", description="Represents a transaction at a venue." )
public class RestTransaction extends RestBase
{
	@ApiField( "The id of the transaction." )
	public long id;
	
	@ApiField( "The amount of the transaction." )
	public Double amount;
	
	@ApiField( "The cashback amount of the transaction." )
	public Double cashbackAmount;
	
	@ApiField( "The cashback billed to the merchant." )
	public Double cashbackBilled;
	
	@ApiField( "The referral fee that was charged to the merchant." )
	public Double referralFee;
	
	@ApiField( "The date of the transaction." )
	public Date dateOfTransaction; 
	
	@ApiField( "The reward datetime" )
	public Date rewardTime;
	
	@ApiField( "The date that Mogl processed the transaction; Note that this will reset on CLEAR." )
	public Date dateProcessed;
	
	@ApiField( "Compact details about the venue." )
	public RestCompactBusiness venue;
	
	@ApiField( "Compact details about the user." )
	public RestCompactUser user;
	
	@ApiField( "The id of the card that made the transaction." )
	public long cardId;
	
	@ApiField( value="The settlement/clearing amount of the transaction.", nullable=true )
	public Double clearingAmount;
	
	@ApiField( value="The authorization amount of the transaction.", nullable=true )
	public Double authorizationAmount;
	
	@ApiField( "The last 4 of the card that made the transaction." )
	public String last4;
	
	@ApiField( "Duplication source -- Only provided when the transaction has been removed as a duplicate." )
	public String duplicationSource;
	
	@ApiField( value="The redemptions that were applied to this transaction.", type=RestRedemption.class )
	public List<RestRedemption> redemptions = new ArrayList<RestRedemption>();
}
