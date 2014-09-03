package com.vinilearning.tribenhbangtraicay.factory;

import java.util.ArrayList;

import android.content.Context;

import com.vinilearning.tribenhbangtraicay.model.MThuocVn;
import com.vinilearning.tribenhbangtraicay.model.MThuocVn.ThoVnBuilder;

public class ThuocFactory {
	public static ArrayList<MThuocVn> lstThoVn;

	public ArrayList<MThuocVn> getLstThuocVn() {
		return lstThoVn;
	}

	private static ThuocFactory instance;
	
	private Context context;

	public static ThuocFactory getInstance(Context context) {
		if (instance == null) {
			instance = new ThuocFactory(context);
		}

		return instance;
	}

	private ThuocFactory(Context context) {
		this.context = context;
	}

	public ArrayList<MThuocVn> generationThuocVn() {
		ArrayList<MThuocVn> data = new ArrayList<MThuocVn>();
		MThuocVn mThoVn;
		ThoVnBuilder builder;
		// 1.
		builder = new ThoVnBuilder("Giới thiệu", "gioithieu.html");
		mThoVn = builder.build();
		data.add(mThoVn);

		return data;
	}
}
