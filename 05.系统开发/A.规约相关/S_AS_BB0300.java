/**
 - ID		AS_BB0300
 - NAME		S_AS_BB0300�N���X
 - Auther	�ӕ���
 - Date		2007/08/10
 - Update	�Ȃ�
 - All rights Reserved Hitachi Information Systems					
 */
package components.s_AS_BB0300;

import components.s_AS_BB0300.check.Check;
import components.s_AS_BB0300.data.S_AS_BB0300_Basic_Req;
import components.s_AS_BB0300.data.S_AS_BB0300_Basic_Resp;
import components.s_AS_BB0300.data.S_AS_BB0300_Check_Req;
import components.s_AS_BB0300.data.S_AS_BB0300_Check_Resp;
import components.s_AS_BB0300.data.S_AS_BB0300_Query_Req;
import components.s_AS_BB0300.data.S_AS_BB0300_Query_Resp;
import components.s_AS_BB0300.data.S_AS_BB0300_Update_Req;
import components.s_AS_BB0300.data.S_AS_BB0300_Update_Resp;
import components.s_AS_BB0300.services.DeleteData;
import components.s_AS_BB0300.services.InsertData;
import components.s_AS_BB0300.services.SearchData;
import components.s_AS_BB0300.services.UpdateData;

/**
 * �@�\�T�v		�����f�[�^�����N���X
 * 
 * @interface	�Ȃ�
 * @extends	�Ȃ�
 * @version	1.0
 * @author		�ӕ���
 * @history	�Ȃ�
 */
public class S_AS_BB0300 {

	/**
	 * �@�\�T�v		�����f�[�^�ďo
	 * 
	 * @param		pip S_AS_BB0300_TPO_Req
	 * @return		S_AS_BB0300_TPO_Resp output
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public S_AS_BB0300_Query_Resp getPoData(S_AS_BB0300_Query_Req pip) {

		return new SearchData().getPoData(pip);
	}

	/**
	 * �@�\�T�v		�����f�[�^��}������
	 * 
	 * @param		updReq S_AS_BB0300_Update_Req
	 * @return		S_AS_BB0300_Update_Resp output
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public S_AS_BB0300_Update_Resp insertPoData(S_AS_BB0300_Update_Req updReq) {

		return new InsertData().InsertPoData(updReq);
	}

	/**
	 * �@�\�T�v		�����f�[�^���X�V
	 * 
	 * @param		updReq S_AS_BB0300_Update_Req
	 * @return		S_AS_BB0300_Update_Resp output
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public S_AS_BB0300_Update_Resp updatePoData(S_AS_BB0300_Update_Req updReq) {

		return new UpdateData().updatePoData(updReq);
	}

	/**
	 * �@�\�T�v		�����f�[�^���폜
	 * 
	 * @param		updReq
	 * @return		S_AS_BB0300_Update_Resp output
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public S_AS_BB0300_Update_Resp deletePoMaster(S_AS_BB0300_Update_Req updReq) {

		return new DeleteData().DeletePoData(updReq);
	}

	/**
	 * �@�\�T�v		�T�[�o���̃`�F�b�N
	 * 
	 * @param		chkReq
	 * @return		S_AS_BB0300_Check_Resp checkOutput
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public S_AS_BB0300_Check_Resp serverCheck(S_AS_BB0300_Check_Req chkReq) {

		S_AS_BB0300_Check_Resp checkOutput = new Check().check(chkReq);
		return checkOutput;
	}

	/**
	 * �@�\�T�v		�폜�r������e�[�u��
	 * 
	 * @param		input S_AS_BB0300_TPO_Req
	 * @return		S_AS_BB0300_TPO_Resp
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public S_AS_BB0300_Query_Resp deleteLock(S_AS_BB0300_Query_Req input) {

		return new DeleteData().deleteLock(input);
	}

	/**
	 * �@�\�T�v		�o�^�{�^���������A�`�F�b�N���s���B
	 * 
	 * @param		input S_AS_BB0300_Check_Req
	 * @return		S_AS_BB0300_Check_Resp
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public S_AS_BB0300_Check_Resp checkBtnOk(S_AS_BB0300_Check_Req input) {

		return new Check().checkBtnOk(input);
	}

	/**
	 * �@�\�T�v		�i�ڏ����擾����
	 * 
	 * @param		strItemCd  �i�ڃR�[�h
	 * @return		�i�ڏ��
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public S_AS_BB0300_Check_Resp getItemInfo(String strItemCd) {

		return new SearchData().getItemInfo(strItemCd);
	}

	/**
	 * �@�\�T�v		�H���ԍ�-�H���}�Ԃ��擾
	 * 
	 * @param		strPoNo �����ԍ�
	 * @return		�H���ԍ�-�H���}��
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public String[] getWorkNo(String strPoNo) {

		return new SearchData().getWorkNo(strPoNo);
	}

	/**
	 * �@�\�T�v		�H����{�����擾
	 *
	 * @param		req
	 * @return		S_AS_BB0300_Basic_Resp
	 * @version	1.0
	 * @history	�Ȃ�
	 */
	public S_AS_BB0300_Basic_Resp getBasicData(S_AS_BB0300_Basic_Req req) {

		return new SearchData().queryBasicData(req);
	}
	//	�ǉ� ��⪕q 2009/04/09 �J�n
	public S_AS_BB0300_Check_Resp checkBtnPoWmtOk(S_AS_BB0300_Check_Req input) {

		return new Check().checkBtnPoAmt(input);
	}
	//�ǉ� ��⪕q 2009/04/09 �I��
}
