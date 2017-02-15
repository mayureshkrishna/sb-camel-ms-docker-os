package com.amnotion.customer.comments.model;

public class CustomerComment {
	
	private String accountNumber;
	private String customerName;
	private String commentId;
	private String entryDate;
	private String sequenceNumber;
	private String commentLineText;
	private String userId;
	
	public CustomerComment() {
		//Do nothing...
	}

	public CustomerComment(String commentLineText) {
		this.commentLineText = commentLineText;
	}


	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}	

	/**
	 * @return the commentId
	 */
	public String getCommentId() {
		return commentId;
	}

	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(String commentId) {
	//	if (CommonUtilsProcessor.isNullEmpty(commentId)) this.commentId = entryDate + String.format("%03d", Integer.parseInt(sequenceNumber));
	//	else 
			this.commentId = commentId;
	}

	/**
	 * @return the entryDate
	 */
	public String getEntryDate() {
		return entryDate;
	}

	/**
	 * @param entryDate the entryDate to set
	 */
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * @return the sequenceNumber
	 */
	public String getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * @param sequenceNumber
	 *            the sequenceNumber to set
	 */
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = String.format("%03d", Integer.parseInt(sequenceNumber));
	}
	
	/**
	 * @return the commentLineText
	 */
	public String getCommentLineText() {
		return commentLineText;
	}

	/**
	 * @param commentLineText
	 *            the commentLineText to set
	 * @throws BusinessException 
	 */
	public void setCommentLineText(String commentLineText) {
		this.commentLineText = commentLineText;
	}
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the customerName
	 */
		
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
