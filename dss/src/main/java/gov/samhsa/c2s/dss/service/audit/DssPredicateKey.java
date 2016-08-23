/*******************************************************************************
 * Open Behavioral Health Information Technology Architecture (OBHITA.org)
 *   
 *   Redistribution and use in source and binary forms, with or without
 *   modification, are permitted provided that the following conditions are met:
 *       * Redistributions of source code must retain the above copyright
 *         notice, this list of conditions and the following disclaimer.
 *       * Redistributions in binary form must reproduce the above copyright
 *         notice, this list of conditions and the following disclaimer in the
 *         documentation and/or other materials provided with the distribution.
 *       * Neither the name of the <organization> nor the
 *         names of its contributors may be used to endorse or promote products
 *         derived from this software without specific prior written permission.
 *   
 *   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *   ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *   WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *   DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 *   DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *   (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *   LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *   ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *   (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *   SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package gov.samhsa.c2s.dss.service.audit;

import gov.samhsa.c2s.common.audit.PredicateKey;

public enum DssPredicateKey implements PredicateKey {
	PATIENT_UNIQUE_ID,
	RECIPIENT_SUBJECT_NPI,
	INTERMEDIARY_SUBJECT_NPI,
	PURPOSE_OF_USE,
	XACML_POLICY,
	XACML_POLICY_ID,
	REQUEST_BODY,
	RESPONSE_BODY,
	SECTION_OBLIGATIONS_APPLIED,
	CATEGORY_OBLIGATIONS_APPLIED,
	ORIGINAL_DOCUMENT,
	SEGMENTED_DOCUMENT,
	ORIGINAL_DOCUMENT_VALID,
	SEGMENTED_DOCUMENT_VALID,
	RULES_FIRED,
	DOMAIN_ID,
	POLICY_ID,
	STATUS;

	@Override
	public String getPredicateKey() {
		return this.toString();
	}

}
