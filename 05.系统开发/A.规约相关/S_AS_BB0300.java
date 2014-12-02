/**
 - ID		AS_BB0300
 - NAME		S_AS_BB0300クラス
 - Auther	胡文清
 - Date		2007/08/10
 - Update	なし
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
 * 機能概要		発注データ処理クラス
 * 
 * @interface	なし
 * @extends	なし
 * @version	1.0
 * @author		胡文清
 * @history	なし
 */
public class S_AS_BB0300 {

	/**
	 * 機能概要		発注データ呼出
	 * 
	 * @param		pip S_AS_BB0300_TPO_Req
	 * @return		S_AS_BB0300_TPO_Resp output
	 * @version	1.0
	 * @history	なし
	 */
	public S_AS_BB0300_Query_Resp getPoData(S_AS_BB0300_Query_Req pip) {

		return new SearchData().getPoData(pip);
	}

	/**
	 * 機能概要		発注データを挿し込む
	 * 
	 * @param		updReq S_AS_BB0300_Update_Req
	 * @return		S_AS_BB0300_Update_Resp output
	 * @version	1.0
	 * @history	なし
	 */
	public S_AS_BB0300_Update_Resp insertPoData(S_AS_BB0300_Update_Req updReq) {

		return new InsertData().InsertPoData(updReq);
	}

	/**
	 * 機能概要		発注データを更新
	 * 
	 * @param		updReq S_AS_BB0300_Update_Req
	 * @return		S_AS_BB0300_Update_Resp output
	 * @version	1.0
	 * @history	なし
	 */
	public S_AS_BB0300_Update_Resp updatePoData(S_AS_BB0300_Update_Req updReq) {

		return new UpdateData().updatePoData(updReq);
	}

	/**
	 * 機能概要		発注データを削除
	 * 
	 * @param		updReq
	 * @return		S_AS_BB0300_Update_Resp output
	 * @version	1.0
	 * @history	なし
	 */
	public S_AS_BB0300_Update_Resp deletePoMaster(S_AS_BB0300_Update_Req updReq) {

		return new DeleteData().DeletePoData(updReq);
	}

	/**
	 * 機能概要		サーバ側のチェック
	 * 
	 * @param		chkReq
	 * @return		S_AS_BB0300_Check_Resp checkOutput
	 * @version	1.0
	 * @history	なし
	 */
	public S_AS_BB0300_Check_Resp serverCheck(S_AS_BB0300_Check_Req chkReq) {

		S_AS_BB0300_Check_Resp checkOutput = new Check().check(chkReq);
		return checkOutput;
	}

	/**
	 * 機能概要		削除排他制御テーブル
	 * 
	 * @param		input S_AS_BB0300_TPO_Req
	 * @return		S_AS_BB0300_TPO_Resp
	 * @version	1.0
	 * @history	なし
	 */
	public S_AS_BB0300_Query_Resp deleteLock(S_AS_BB0300_Query_Req input) {

		return new DeleteData().deleteLock(input);
	}

	/**
	 * 機能概要		登録ボタン押下時、チェックを行う。
	 * 
	 * @param		input S_AS_BB0300_Check_Req
	 * @return		S_AS_BB0300_Check_Resp
	 * @version	1.0
	 * @history	なし
	 */
	public S_AS_BB0300_Check_Resp checkBtnOk(S_AS_BB0300_Check_Req input) {

		return new Check().checkBtnOk(input);
	}

	/**
	 * 機能概要		品目情報を取得する
	 * 
	 * @param		strItemCd  品目コード
	 * @return		品目情報
	 * @version	1.0
	 * @history	なし
	 */
	public S_AS_BB0300_Check_Resp getItemInfo(String strItemCd) {

		return new SearchData().getItemInfo(strItemCd);
	}

	/**
	 * 機能概要		工事番号-工事枝番を取得
	 * 
	 * @param		strPoNo 発注番号
	 * @return		工事番号-工事枝番
	 * @version	1.0
	 * @history	なし
	 */
	public String[] getWorkNo(String strPoNo) {

		return new SearchData().getWorkNo(strPoNo);
	}

	/**
	 * 機能概要		工事基本情報を取得
	 *
	 * @param		req
	 * @return		S_AS_BB0300_Basic_Resp
	 * @version	1.0
	 * @history	なし
	 */
	public S_AS_BB0300_Basic_Resp getBasicData(S_AS_BB0300_Basic_Req req) {

		return new SearchData().queryBasicData(req);
	}
	//	追加 羅筱敏 2009/04/09 開始
	public S_AS_BB0300_Check_Resp checkBtnPoWmtOk(S_AS_BB0300_Check_Req input) {

		return new Check().checkBtnPoAmt(input);
	}
	//追加 羅筱敏 2009/04/09 終了
}
