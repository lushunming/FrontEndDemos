FileUpload = function(config) {
	var self = this;
	self.uploader = {};
	self.config = {} | config;
	self.server = config.server;// 上传接口
	self.pick = config.pick;// 选择文件的按钮容器
	self.upload = config.upload;// 上传按钮
	self.resize = config.resize ? true : false; // 不压缩image,
	// 默认如果是jpeg，文件上传前会压缩一把再上传！
	self.dnd = config.dnd;
	self.startUpload = config.startUpload;// 开始上传
	self.uploadFinished = config.uploadFinished;// 所有文件上传完毕
	self.uploadStart = config.uploadStart;// 单文件开始上传
	self.uploadProgress = config.uploadProgress;// 上传进度
	self.uploadSuccess = config.uploadSuccess;// 单文件上传成功
	self.init = function() {
		self.uploader = WebUploader.create({

			// swf文件路径
			swf : "/resources/js/webuploader/Uploader.swf",

			// 文件接收服务端。
			server : self.server,

			// 选择文件的按钮。可选。
			// 内部根据当前运行是创建，可能是input元素，也可能是flash.
			pick : self.pick,

			// 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
			resize : self.resize,
			dnd : self.dnd,
			disableGlobalDnd : true,// 禁止整个页面的拖拽功能

		});
		// 开始上传
		self.uploader.on("startUpload", function() {
			console.log("开始上传");
			if (typeof self.startUpload == "function") {
				self.startUpload();
			}

		});
		// 当所有文件上传结束时触发。
		self.uploader.on("uploadFinished", function() {
			console.log("所有文件上传结束");
			if (typeof self.uploadFinished == "function") {
				self.uploadFinished();
			}

		});
		// 某个文件开始上传前触发，一个文件只会触发一次
		self.uploader.on("uploadStart", function(file) {
			console.log("文件开始上传" + file);
			if (typeof self.uploadStart == "function") {
				self.uploadStart(file);
			}
		});
		// 上传过程中触发，携带上传进度。
		self.uploader.on("uploadProgress", function(file, percentage) {
			console.log("上传进度" + file + percentage);
			if (typeof self.uploadProgress == "function") {
				self.uploadProgress(file, percentage);
			}
		});
		// 当文件上传成功时触发
		self.uploader.on("uploadSuccess", function(file, response) {
			console.log("上传成功" + file + response);
			if (typeof self.uploadSuccess == "function") {
				self.uploadSuccess(file, response);
			}
		});

		$(self.upload).bind("click", function() {
			self.uploader.upload();
		});
	};

}